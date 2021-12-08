# amharic-language-identifier
This software is written as part of my MSc thesis.
The java file uses the tika library for text extraction and language identification.
As the first part of the process first it takes the input file from source and parses the given document. Then it identifies the language type according to the given ngram file, which is embedded with the Tika project.

Tika extracts any type of file that can be structured or unstructured. However, Tika does not detect Amharic language and during the development process one of the challenges was finding an efficient Amharic language identifier. 
Because of this we developed an Amharic language identifier using the N-gram model.
We prepare Amharic. ngp file from Amharic corpus that we collected from different data sources, such as web, bible. Then, we add Amharic language to be detected by the Tika language identifier. The jar file contains the Amharic corpus.


