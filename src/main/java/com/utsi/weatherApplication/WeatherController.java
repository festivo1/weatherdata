package com.utsi.weatherApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class WeatherController {

	@GetMapping(path="/")
	public String home(){
		return "home page";
	}
	
	@GetMapping("/getWeather")
	public List<WeatherData> getWeatherData(){
		List<WeatherData> data = new ArrayList<WeatherData>();
		data.add(new WeatherData(1, null, 30.5, 40, 25));
		data.add(new WeatherData(2, null, 32.5, 42, 22));
		data.add(new WeatherData(3, null, 39.5, 20, 30));
		
		return data;
		
	}
	@GetMapping("/getWeather/{id}")
	public WeatherData getById(@PathVariable int id) {
		List<WeatherData> lists  = getWeatherData();
		ListIterator<WeatherData> itr= lists.listIterator();
		while(itr.hasNext()) {
			WeatherData d =itr.next();
			if(d.getId()==id) {
				return d;
			}
		}
		
		return new WeatherData();
		
	}
}
