/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "computeFactorial")
@RequestScoped
public class computeFactorial {

    public String getResponse() {
        String s = "<table border=\"1\">" +
                "<tr>" +
                "<td>Number</td>" +
                "<td>Factorial</td>" +
                "</tr>";
       for(int i = 0; i <= 10; i++) {
           s += "<tr>";
           s += "<td>" + i + "</td>";
           s += "<td>" + compute(i) + "</td>";
           s += "</tr>";
       }
       s += "</table>";
       return s;
    }
    
    private long compute(int n) {
        if(n == 0) {
            return 1;
        }
        else {
           return n * compute(n - 1);
        }
    }
    
}
