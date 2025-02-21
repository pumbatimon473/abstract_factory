package com.assignment.question;

// Part 3: Define DocumentFactoryFactory - Optional
// - Simple Factory for DocumentFactory
public class DocumentFactoryFactory {
    public static DocumentFactory getDocumentFactory(DocumentType type) {
        switch (type) {
            case SPREAD_SHEET:
                return new SpreadsheetDocumentFactory();
            case TEXT:
                return new TextDocumentFactory();
            default:
                throw new IllegalArgumentException("Invalid document type: " + type);
        }
    }
}
