package com.assignment.question;

import com.assignment.question.notification.Notification;
import com.assignment.question.notification.PushNotification;
import com.assignment.question.sender.NotificationSender;
import com.assignment.question.sender.PushNotificationSender;
import com.assignment.question.template.NotificationTemplate;
import com.assignment.question.template.PushNotificationTemplate;

// Part 2: Implement NotificationFactory interface - Concrete Factory
public class PushNotificationFactory extends NotificationFactory {
    // CTOR
    public PushNotificationFactory() {
        // initialization logic
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification getNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient, template);
    }

    @Override
    public NotificationTemplate getTemplate(String message) {
        return new PushNotificationTemplate(message);
    }

    @Override
    public NotificationSender getNotificationProvider(Notification notification) {
        return new PushNotificationSender(notification);
    }
}