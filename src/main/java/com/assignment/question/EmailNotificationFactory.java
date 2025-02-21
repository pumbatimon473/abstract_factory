package com.assignment.question;

import com.assignment.question.notification.EmailNotification;
import com.assignment.question.notification.Notification;
import com.assignment.question.sender.EmailNotificationSender;
import com.assignment.question.sender.NotificationSender;
import com.assignment.question.template.EmailNotificationTemplate;
import com.assignment.question.template.NotificationTemplate;

// Part 2: Implement NotificationFactory interface - Concrete Factory
public class EmailNotificationFactory extends NotificationFactory {
    // CTOR
    public EmailNotificationFactory() {
        // initialization logic
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification getNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient, sender, template);
    }

    @Override
    public NotificationTemplate getTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }

    @Override
    public NotificationSender getNotificationProvider(Notification notification) {
        return new EmailNotificationSender(notification);
    }
}