package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reservation(int roomNumber, Date checkIn, Date checkOut) throws DomainException{
        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckout() {
        return checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);// transforma valor de milisegundos em dias
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException{
        
        Date now = new Date();

        if (checkIn.before(now)|| checkOut.before(now)){
            throw new DomainException("Reserverion dates for update must be future dates");
        }

        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString(){
        return "Room " + roomNumber + ", CheckIn: " + sdf.format(checkIn) + ", CheckOut: " + sdf.format(checkOut) + ", " + duration() + " nights";
    }

}
