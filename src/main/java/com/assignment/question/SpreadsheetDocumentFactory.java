package com.assignment.question;

import com.assignment.question.parser.DocumentParser;
import com.assignment.question.parser.SpreadsheetDocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.printer.SpreadsheetDocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;
import com.assignment.question.processor.SpreadsheetDocumentProcessor;

// Part 2: Implement DocumentFactory interface - Concrete Factory
public class SpreadsheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentParser getParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentProcessor getProcessor(String name) {
        return new SpreadsheetDocumentProcessor(name);
    }

    @Override
    public DocumentPrinter getPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

}