package com.assignment.question;

// Part 3: Define NotificationFactoryFactory - Optional
// - A simple factory for NotificationFactory
public class NotificationFactoryFactory {
    public static NotificationFactory getNotificationFactory(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailNotificationFactory();
            case PUSH:
                return new PushNotificationFactory();
            default:
                throw new IllegalArgumentException("Invalid Notification Type: " + type);
        }
    }
}
