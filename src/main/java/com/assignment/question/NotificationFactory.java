package com.assignment.question;

import com.assignment.question.notification.Notification;
import com.assignment.question.sender.NotificationSender;
import com.assignment.question.template.NotificationTemplate;

// Part 1: Define NotificationFactory interface - Abstract Factory
public abstract class NotificationFactory {
    public abstract NotificationType notificationType();

    // interfaces
    public abstract Notification getNotification(String recipient, String sender, NotificationTemplate template);

    public abstract NotificationTemplate getTemplate(String message);

    public abstract NotificationSender getNotificationProvider(Notification notification);
}