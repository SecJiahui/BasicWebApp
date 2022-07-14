package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "MyTeam";
        } else if (query.contains("following numbers is the largest")) { //
            // TODO extend the programm here

         //   String[] newStr = StringUtils.split(query);
            return "";
        } else if (query.contains("plus")) {
            String[] newStr = query.split("\\s+");
            return newStr[3] + newStr [5];
        } else {
            return "Sorry, it is too hard for me";
        }
    }
}
