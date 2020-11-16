/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner.Flight;

import Business.Airliner.Airliner;
import Business.Airliner.Fleet.Airplane;
import Business.TravelOffice.Customer.Customer;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//import javafx.util.converter.LocalDateTimeStringConverter;


public class Flight {

    private String[][] seatNumber;
    private Map<String,Customer> seatMap;
    private Airliner airliner;
    private String flightNo;
    private Airplane airplane;
    private String departure;
    private String destination;
    private Date date;
    private LocalTime startTime;
    private LocalTime arriveTime;
    private double price; 
    private String startTimeRange;
    
    public Flight(Airliner airliner){
        this.airliner = airliner;
        setSeatMap();
    }
    public Flight(Airplane plane){
        this.airplane = airplane;
        setSeatMap();
    }
    
    
    public Flight(Airliner airliner,String flightNo,Airplane airplane,String departure,String destination,Date date,LocalTime startTime,LocalTime arriveTime,double price){
        this.airliner = airliner;
        this.flightNo = flightNo;
        this.airplane = airplane;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.startTime= startTime;
        this.arriveTime = arriveTime;
        this.price = price;
        this.startTimeRange = getTimeRange(startTime);
        setSeatMap();
    }

    public Flight() {
        setSeatMap();

    }
    
    public void setSeatMap(){
        seatNumber = new String[25][6];
        for(int i=0; i<25; i++){
            String row = Integer.toString(i);
            seatNumber[i] = new String[]{row+"A",row+"B",row+"C",row+"E",row+"F",row+"G"};
        }
        this.seatMap = new HashMap<>();
        for(int i = 0; i<25;i++){
            for(int j=0; j<6; j++){
                this.seatMap.put(seatNumber[i][j], null);
            }
        }
    }
    
    public void SeatAssignment(Customer customer, String seatNum){
        this.seatMap.put(seatNum, customer);
    }
    
    public Map<String,Customer> getSeatAssignment(){
        return this.seatMap;
    }
    
    public List<String> getAvaliableSeat(){
       
        List<Map.Entry<String, Customer>> s = this.seatMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == null)
                .collect(Collectors.toList());

        List<String> avaliableSeat = new ArrayList<>();
        for(Map.Entry<String, Customer> entry: s) {
            avaliableSeat.add(entry.getKey());
        }
        
        System.out.println(avaliableSeat.toArray());
        
        return avaliableSeat;
    }

    private String getTimeRange(LocalTime time){
        String timeRange;
        int compMorning = time.compareTo(LocalTime.of(5, 0));
        int compDaytime = time.compareTo(LocalTime.of(10, 0));
        int compEvening = time.compareTo(LocalTime.of(20, 0));
        if(compMorning>=0){
            Integer a = 2;
            if(compDaytime<0){
                timeRange = "morning";
            }else{
                if(compEvening<0){
                    timeRange = "daytime";
                }else{
                    timeRange = "evening";
                }
            }
        }else{
            timeRange = "evening";
        }
        return timeRange;
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }
    public String getFlightNo(){
        return flightNo;
    }
    public void setFlightNo(String flightNo){
        this.flightNo =flightNo;
    }
    
    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDateObject() {
        return date;
    }
    
    public String getDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(LocalTime arriveTime) {
        this.arriveTime = arriveTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    public String getRoute(){
        String route =departure+"—"+destination;
        return route;
    }
    
    public String getTime(){
        String time = startTime+"—"+arriveTime;
        return time;
    }
    
    public String getStartTimeRange(){
        return this.startTimeRange;
    }
  
        @Override
    public String toString(){
        return this.flightNo ;
      
    }
}
