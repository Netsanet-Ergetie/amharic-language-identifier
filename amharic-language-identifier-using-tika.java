/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.language.*;
//import org.apache.pdfbox.pdfparser.PDFObjectStreamParser;
import org.apache.tika.exception.TikaException;
import org.apache.tika.language.LanguageIdentifier;

import org.xml.sax.SAXException;

public class lan {

   public static void main(String args[])throws IOException, SAXException, TikaException {

     // Get the input file from source
	   File file = new File("C:/Users/netsi/Desktop/crawle/doc1.pdf");

	      //Parser method parameters
	      Parser parser = new AutoDetectParser();
	      BodyContentHandler handler = new BodyContentHandler();
	      Metadata metadata = new Metadata();
	      FileInputStream content = new FileInputStream(file);

	      //Parsing the given document
	      parser.parse(content, handler, metadata, new ParseContext());

	      LanguageIdentifier object = new LanguageIdentifier(handler.toString());
              
          String lan =object.getLanguage();
            
            
         //System.out.println(lan);
         if("amh".equals(lan))     
         {
	        System.out.println("the language is amharic ");
         }
         else{
            System.out.println("Language name :" + object.getLanguage());
         }
            
   }
   
}