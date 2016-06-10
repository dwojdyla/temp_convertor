package model;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
/**
 * Temperator Convertor 
 * @author: Dominik Wojdyla
 * @06.06.2016
 *
 */

@ManagedBean
@ApplicationScoped
public class TemperatureConvertor implements Serializable {
	private final static long serialVersionUID = 1L;
	private double convert;
	private double converted;
	private boolean initial;
	private String unit;
	
	/**
	 * 
	 * Getter und setter
	 * 
	 */
	public double getConvert() {
		return convert;
	}
	public void setConvert(double convert) {
		this.convert = convert;
	}
	public double getConverted() {
		return converted;
	}
	public boolean getInitial() {
		return initial;
	}
	public String getUnit() {
		return unit;
	}
	/**
	 * Convertor wird auf 0 gesetzt.
	 */
	public void init(){
		initial = true;
		converted = 0;
		convert = 0;
		unit="";
	}
	/**
	 *Reset Methode. Hier wird durch init();
	 *alles auf 0 gesetzt, resetet. 
	 */
	public String reset(){
		init();
		return "reset";
	}
	/**
	 * Hier wird con Grad Celcius
	 * in FFahrenheit umgerechnet
	 */
	public void celsiusToFahrenheit(){
		this.initial = false;
		this.unit = "Fahrenheit";
		this.converted = (convert * 1.8) + 32; 
	}
	/**
	 * 
	 * Hie wird von Fahrenheit zu Celsius umgerechnet
	 */
	public void fahrenheitToCelsius(){
		this.initial = false;
		this.unit = "Celsius ";
		this.converted = ((convert - 32)*5)/9;
	}
	/**
	 * 
	 * Hier wird con Celsius in Kelvin umgerechnet. 
	 * Dazu müssen zu den grad Celsius einfach nur 273 dazugerechnet werden. 
	 * 
	 */
	public void celsiusToKelvin(){
		this.initial = false;
		this.unit = "Kelvin ";
		this.converted = (convert + 273 );
	}
	/**
	 * Hier wird con Kelvin zu Celsius umgerechnet. 
	 * Dazu müssen von den kelvin 273 abgezogen werden. 
	 * 
	 */
	public void kelvinToCelsius(){
		this.initial = false;
		this.unit = "Celsius ";
		this.converted = (convert - 273 );
	}
	/**
	 * 
	 * Hier wird von Fahrenheit in Kelvin umgerechnet.
	 */
	public void fahrenheitToKelvin(){
		this.initial = false;
		this.unit = "Kelvin ";
		this.converted = (convert - 32)* 5/9 + 273;
	}
	/**
	 * Hier berechnen wir uns die Fahrenheit 
	 * 
	 */
	public void kelvinToFahrenheit(){
		this.initial = false;
		this.unit = "Fahrenheit ";
		this.converted = ((convert - 273 ) * 1.8) + 32;
	}
	
}