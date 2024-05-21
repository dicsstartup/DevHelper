module com.dicsstartup.devhelper {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.base;
    
    opens com.dicsstartup.devhelper to org.hibernate.orm.core, javafx.fxml;
    opens com.dicsstartup.devhelper.core.controllers to javafx.fxml;
    opens com.dicsstartup.devhelper.core.entitys to org.hibernate.orm.core;
    
    exports com.dicsstartup.devhelper;
    exports com.dicsstartup.devhelper.core.util;
}
