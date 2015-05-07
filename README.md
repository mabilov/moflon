# README #

eMoflon TGG rules for synchronization between BPMN and Use Case as well as Use Case and Sequence Diagram . 

### How do I get set up? ###
First of all you need to have JDK 8 installed

Then you would need Eclipse Luna

In eclipse luna you need to install emoflon plugin (check http://www.moflon.org/emoflon/)

You would also need Xtext plugin (check https://eclipse.org/Xtext/)

To edit TGG rules you need to install Enterprise Architect 11 (not 12) plus plugin for moflon 

All cloned projects need to be imported into eclipse. 

To run forward transformation from bpmn to use case  you would need to specify new Run configuration in eclipse for the test project Bpmn2UseCaseTest to use main class "de.abilov.tgg.bpmn2usecase.test.ForwardApplication" with arguments "forward instances/booksale1.src.xmi instances/booksale1.trg.usecase instances/booksale1.corr.xmi instances/booksale1.protocol.xmi".

To run forward synchronization  from bpmn to use case you would need to specify new Run configuration in eclipse for the test project Bpmn2UseCaseTest to use main class 
"de.abilov.tgg.bpmn2usecase.test.SynchronizationApplication" with arguments "forward instances/booksale1.corr.xmi, instances/booksale1.protocol.xmi, instances/booksale2.src.xmi instances/booksale2.trg.usecase instances/booksale2.corr.xmi instances/booksale2.protocol.xmi"

To run backward synchronization form use case to bpmn you would need to specify new Run configuration in eclipse for the test project Bpmn2UseCaseTest to use main class 
"de.abilov.tgg.bpmn2usecase.test.SynchronizationApplication" with arguments "backward instances/booksale2.corr.xmi instances/booksale2.protocol.xmi instances/booksale3.src.xmi instances/booksale3.trg.usecase instances/booksale3.corr.xmi instances/booksale3.protocol.xmi"

To run forward transformation from use case to sequence diagram you would need to specify Run configuration for the test project UseCase2MSDTest  to use main class "de.abilov.tgg.usecase2msd.test.ForwardApplication" with arguments "forward instances/booksale2.src.usecase instances/booksale2.trg.xmi instances/booksale2.corr.xmi instances/booksale2.protocol.xmi".