package com.assignment.question;

import com.assignment.question.parser.DocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;

// Part 1: Define AbstractFactory interface
public abstract class DocumentFactory {
    public abstract DocumentType supportsType();

    // interfaces
    public abstract DocumentParser getParser(String path);

    public abstract DocumentProcessor getProcessor(String name);

    public abstract DocumentPrinter getPrinter(DocumentProcessor processor);
}