package com.kaizenko.turnticketdispenser;

public class TurnTicket
{
    private final int turnNumber;

    public TurnTicket(int turnNumber)
    {
        this.turnNumber = turnNumber;
    }

    public int getTurnNumber()
    {
        return turnNumber;
    }

}
