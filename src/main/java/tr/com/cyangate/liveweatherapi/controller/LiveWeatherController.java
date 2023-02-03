package tr.com.cyangate.liveweatherapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import tr.com.cyangate.liveweatherapi.util.Constant;

@RestController
public class LiveWeatherController {

    @RequestMapping(method = RequestMethod.GET, value = "/{city}/{country}")
    public @ResponseBody
    Object getWeather(@PathVariable String city, @PathVariable String country) {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Object> response = restTemplate.getForEntity("https://api.openweathermap.org/data/2.5/weather?q=" + city + "," + country + "&units=metric"+ "&APPID=" + Constant.API_KEY, Object.class);

        return response;


    }
}
