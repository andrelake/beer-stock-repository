package br.com.andrelake.beerstockmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerMinimumStockExceededException extends Exception {

    public BeerMinimumStockExceededException(Long id, int quantityToIncrement) {
        super(String.format("Beers with %s ID to decrement informed exceeds the minimum stock capacity of ZERO", id));
    }
}
