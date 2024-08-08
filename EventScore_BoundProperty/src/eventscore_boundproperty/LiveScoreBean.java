/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventscore_boundproperty;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author 64050030 Kitipum Nornua
 */
public class LiveScoreBean implements Serializable {
    
    public static final String SCORELINE_PROPERTY = "sampleProperty";
    
    private String scoreLine;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return scoreLine;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = this.scoreLine;
        this.scoreLine = value;
        propertySupport.firePropertyChange(SCORELINE_PROPERTY, oldValue, this.scoreLine);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
