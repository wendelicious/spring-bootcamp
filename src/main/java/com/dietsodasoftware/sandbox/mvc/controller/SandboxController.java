package com.dietsodasoftware.sandbox.mvc.controller;

import com.dietsodasoftware.sandbox.mvc.view.Thing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * User: wendel.schultz
 * Date: 7/10/14
 */
@Controller
@RequestMapping("/things")
public class SandboxController {

    @RequestMapping(method = POST, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public @ResponseBody Map thing( @RequestBody Thing thing){

        final Map<String, Thing> things = new HashMap();
        things.put("thing", thing);
        return things;

    }

}
