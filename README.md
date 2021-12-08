# Amharic-language-identifier
This software is written as part of my MSc thesis.
The java file uses the tika library for text extraction and language identification.
As the first part of the process first it takes the input file from source and parses the given document. Then it identifies the language type according to the given ngram file, which is embedded with the Tika project. But Tika does not identify Amharic language.
To address this we prepared Amharic n-gram file from different Amharic corpus. 
And configured Tika to identify Amharic language.



