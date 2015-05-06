/*
 * generated by Xtext
 */
package UseCaseDSL.formatting2;

import UseCaseDSL.Actor
import UseCaseDSL.BasicFlow
import UseCaseDSL.Flow
import UseCaseDSL.NamedFlow
import UseCaseDSL.NormalStep
import UseCaseDSL.PackageDeclaration
import UseCaseDSL.Step
import UseCaseDSL.StepAlternative
import UseCaseDSL.UseCase
import UseCaseDSL.UseCasesModel
import UseCaseDSL.services.UseCaseGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

import static UseCaseDSL.UseCaseDSLPackage.Literals.*

class UseCaseFormatter extends AbstractFormatter2 {
	
	@Inject extension UseCaseGrammarAccess

	def dispatch void format(UseCasesModel usecasesmodel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (PackageDeclaration _package : usecasesmodel.getPackages()) {
			_package.format
		}
	}

	def dispatch void format(PackageDeclaration packageDeclaration, extension IFormattableDocument document) {
		packageDeclaration.regionFor.keyword("actors").prepend[newLine]
		//var first = true
		for (Actor actor : packageDeclaration.getActors()) {
			actor.format
			actor.append[newLine]
		}
		
		for (UseCase useCase : packageDeclaration.useCases) {
			useCase.format
			useCase.prepend[newLine]
			useCase.prepend[noIndentation]
		}
	}

	def dispatch void format(UseCase useCase, extension IFormattableDocument document) {
		var open = useCase.regionFor.keyword("preconditions");
		open.prepend[newLine]
		for (Flow flow : useCase.flows) {
			if (flow instanceof BasicFlow) {
				flow.prepend[newLine]
				format(flow as BasicFlow, document)
			}
		}
		for (Flow flow: useCase.flows) {
			if (flow instanceof NamedFlow) {
				flow.prepend[newLine]
				format(flow as NamedFlow, document)
			}
		}
	}

	def dispatch void format(BasicFlow flow, extension IFormattableDocument document) {
		val open = flow.regionFor.keyword('basic flow')
		val close = flow.regionFor.keyword('end flow')
		open.append[newLine]
		interior(open, close)[indent]
		for (Step step: flow.steps) {
			step.format
			step.append[newLine]
		}
	}

	def dispatch void format(NamedFlow flow, extension IFormattableDocument document) {
		var open = flow.regionFor.feature(NAMED_FLOW__NAME);
		val close = flow.regionFor.keyword('end flow')
		open.append[newLine]
		interior(open, close)[indent]
		for (Step step: flow.steps) {
			step.format
			step.append[newLine]
		}
	}

	def dispatch void format(NormalStep step, extension IFormattableDocument document) {
		var open = step.regionFor.keyword("alternatives").prepend[newLine]
		var close = step.regionFor.keyword("else")
		interior(open, close)[indent]
		for (StepAlternative alt : step.stepAlternative) {
			alt.format
			alt.prepend[newLine]
		}
		step.regionFor.keyword('else').prepend[newLine];
	}
}
