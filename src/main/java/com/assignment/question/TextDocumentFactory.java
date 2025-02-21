package com.assignment.question;

import com.assignment.question.parser.DocumentParser;
import com.assignment.question.parser.TextDocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.printer.TextDocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;
import com.assignment.question.processor.TextDocumentProcessor;

// Part 2: Implement AbstractFactory interface - Concrete Factory
public class TextDocumentFactory extends DocumentFactory {

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentParser getParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentProcessor getProcessor(String name) {
        return new TextDocumentProcessor(name);
    }

    @Override
    public DocumentPrinter getPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }
}