/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;

/**
 *
 * @author Wilson Gitau
 */
import org.json.*;
public class SendSms {

  public SendSms(String recipients,String message)
    {       String answer=null;
	     // Specify your login credentials
	     String username = "wndungi";
	     String apiKey   = "7ac30ce4de2c4cc957d3cde506037531abfbf0b24e8e19e8373a0eda3a215ef4";
	
             // Create a new instance of our awesome gateway class
	     SmsGateway gateway  = new SmsGateway(username, apiKey);
	
	     // Thats it, hit send and we'll take care of the rest. Any errors will
	     // be captured in the Exception class below
	    try {
	        JSONArray results = gateway.sendMessage(recipients, message);
			
	        for( int i = 0; i < results.length(); ++i ) {
		          JSONObject result = results.getJSONObject(i);
                          System.out.println(result.getString("status")+","+result.getString("number") + ","+result.getString("messageId"));
	    }
                
   	}
   	
   	catch (Exception e) {
            System.out.println("Encountered an error while sending " + e.getMessage());
	    }
      
	
   }
}
  

