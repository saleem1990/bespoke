/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbadmin;

import java.lang.reflect.Field;
import javax.swing.JButton;

/**
 *
 * @author saleem
 */
public class DomainsFactory {

    public DomainsFactory() {

    }

    public static void disableMenus(java.lang.Class className, String userName, java.sql.Connection connectDB) {
        java.lang.reflect.Field[] fieldsArray = null;

        fieldsArray = className.getDeclaredFields();

        for (int x = 0; x < fieldsArray.length; x++) {
            if (fieldsArray[x].toString().endsWith("mnit") && notAllocated(fieldsArray[x])) {
                
                // = new JButton();
                JButton disButton = (JButton) fieldsArray[x].get(this);
                
                
                

            }

        }

    }
    public static Boolean notAllocated(Field field){
        Boolean allocated = false;
        
        
        
        return allocated;
        
    }

}
