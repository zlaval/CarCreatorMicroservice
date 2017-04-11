package com.zlrx.javadevzed.microservice.creatorui.view;


import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.zlrx.javadevzed.microservice.chassisinterface.Chassis;
import com.zlrx.javadevzed.microservice.creatorui.client.ChassisRestClient;
import com.zlrx.javadevzed.microservice.creatorui.client.EngineRestClient;
import com.zlrx.javadevzed.microservice.creatorui.client.WheelRestClient;
import com.zlrx.javadevzed.microservice.engineinterface.Engine;

import javax.inject.Inject;
import java.util.List;

@SpringUI
@Theme("valo")
public class CreatorUi extends UI {

    @Inject
    private ChassisRestClient chassisRestClient;

    @Inject
    private EngineRestClient engineRestClient;

    @Inject
    private WheelRestClient wheelRestClient;


    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.setWidth(100, Unit.PERCENTAGE);
        verticalLayout.addComponent(comboBox(chassisRestClient.getChassis(), "Chassis", Chassis::getProducer));
        verticalLayout.addComponent(comboBox(engineRestClient.getEngine(), "Engine", Engine::getProducer));
        verticalLayout.addComponent(comboBox(wheelRestClient.getWheel(), "Wheel",
                item -> String.format("%d/%dR%d", item.getWidth(),item.getHeight(), item.getRadial())));
        setContent(verticalLayout);
    }

    private <T> ComboBox<T> comboBox(List<T> data, String caption, ItemCaptionGenerator<T> itemCaptionGenerator) {
        ComboBox<T> comboBox = new ComboBox<>(caption, data);
        comboBox.setItemCaptionGenerator(itemCaptionGenerator);

        return comboBox;
    }


}
