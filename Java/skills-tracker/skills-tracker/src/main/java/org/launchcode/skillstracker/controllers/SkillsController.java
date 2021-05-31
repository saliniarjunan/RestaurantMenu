package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String initialDisplay(){
        return "<h1>Skills Tracker</h1>"+
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol><li>Java</li><li>JavaScript</li><li>Python</li></ol>";
    }


    @RequestMapping(value = "displayUserSelection", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String displayUserSelection (@RequestParam String name, String firstSelection, String secondSelection, String thirdSelection){
        return "<h1>" + name  + "</h1>"+
                "<h2><ol>" +
                "<li>" + firstSelection + "</li>" +
                "<li>"+ secondSelection +"</li>" +
                "<li>" + thirdSelection + "</li>" +
                "</ol></h2>";
    }

    @RequestMapping(value = "userSelectionInTable", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String userSelectionInTable (@RequestParam String name, String firstSelection, String secondSelection, String thirdSelection){
        return "<html>" +
                "<body>" +
                "<h2>" + name + "</h2>" +

                "<table border='1%' >" +
                "  <tr>" +
                "    <th> First favorite language </th>" +
                "    <th> Second favorite language </th>" +
                "    <th> Third favorite language </th>" +
                "  </tr>" +
                "  <tr style=text-align:center>" +
                "    <td  >" + firstSelection + "</td>" +
                "<td>" + secondSelection + "</td>" +
                "    <td>" + thirdSelection + "</td>" +
                "  </tr>" +

                "</table>" +


                "</body>" +
                "</html>";


    }


    @GetMapping("form")
    @ResponseBody
    public String formSelection(){
        return "<html>" +
                "<body>" +
                "<form action='userSelectionInTable'>" +
                "Name:<br><input type='text' name='name'><br>"+
                "My favorite language: <br> <select name='firstSelection'>"+
                "<option value='Java'>Java</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "My second favorite language: <br><select name='secondSelection'>"+
                "<option value='Java'>Java</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "My third favorite language: <br><select name='thirdSelection'>"+
                "<option value='Java'>Java</option>"+
                "<option value='JavaScript'>JavaScript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "<input type='submit' value='submit'>"+
                "</form></body></html>";
    }

}
