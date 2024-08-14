package teka.group.vaadin_intro;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView(){
        VerticalLayout todoListLayout = new VerticalLayout();
        TextField textField = new TextField();
        Button addBtn = new Button("Add");
        addBtn.addClickListener( click -> {
            Checkbox checkbox = new Checkbox(textField.getValue());
            todoListLayout.add(checkbox);
            textField.setValue("");
        });
        addBtn.addClickShortcut(Key.ENTER);

        add(
                new H1("Vaadin Todo"),
                todoListLayout,
                new HorizontalLayout(
                        textField,
                        addBtn
                )
        );

    }

}
