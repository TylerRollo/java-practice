package com.example.demo;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {
    
    public MainView(){
        var button = new Button("click me!");
        var textField = new TextField("", "Enter your name");
        add(new HorizontalLayout(textField, button));

        button.addClickListener(e ->
            Notification.show("Hello " + textField.getValue() + "!")
        );

    }

}
