package com.dubreuia.ui;

import com.dubreuia.model.Action;
import com.intellij.ui.IdeBorderFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

import static com.dubreuia.model.Action.*;

class InspectionPanel {

    private static final String TEXT_TITLE_INSPECTIONS = "Java inspection and quick fix actions";

    private final Map<Action, JCheckBox> checkboxes;

    InspectionPanel(final Map<Action, JCheckBox> checkboxes) {
        this.checkboxes = checkboxes;
    }

    JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setBorder(IdeBorderFactory.createTitledBorder(TEXT_TITLE_INSPECTIONS));
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(checkboxes.get(localCanBeFinal));
        panel.add(checkboxes.get(fieldCanBeFinal));
        panel.add(checkboxes.get(explicitTypeCanBeDiamond));
        panel.add(checkboxes.get(unqualifiedFieldAccess));
        panel.add(checkboxes.get(suppressAnnotation));
        panel.add(checkboxes.get(finalPrivateMethod));
        panel.add(checkboxes.get(unnecessarySemicolon));
        panel.add(Box.createHorizontalGlue());
        panel.setMinimumSize(new Dimension(Short.MAX_VALUE, 0));
        return panel;
    }

}