/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;
import java.util.Arrays;
/**
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC311 2023 AI Practical
 */
public class State implements Comparable<State>
{
    //creating characteristics of board and objects in the board
    private int[] board;
    private int heuristicValue;
    private int positionOfNine;

    //creating constructor for the initial state of the board
    public State(int[] board, int heuristicValue, int positionOfNine)
    {
        this.board = board;
        this.heuristicValue = heuristicValue;
        this.positionOfNine = positionOfNine;
    }

    //accessor methods for initial state of board
    public int[] getBoard()
    {
        return board;
    }

    public int getHeuristicValue()
    {
        return heuristicValue;
    }

    public int getPositionOfNine() 
    {
        return positionOfNine;
    }

    //mutator methods for initial state of board
    public void setBoard(int[] board)
    {
        this.board = board;
    }

    public void setHeuristicValue(int heuristicValue)
    {
        this.heuristicValue = heuristicValue;
    }

    public void setPositionOfNine(int positionOfNine) 
    {
        this.positionOfNine = positionOfNine;
    }

    //public method to moves and generate children states
    public State[] generateChildren()
    {
        //creating for possible moves for the child states
        State[] children = new State[4];
        //ints = different positions 
        int[] deltas = {-3, 3, -1, 1};

        //for loop that runs four time checking if the next move on the board for 9 is valid
        for (int i = 0; i < 4; i++)
        {
            int newPos = positionOfNine + deltas[i];
            if (isValidMove(newPos))
            {
                int[] newBoard = Arrays.copyOf(board, board.length);
                swap(newBoard, positionOfNine, newPos);
                children[i] = new State(newBoard, heuristicValue, newPos);
            }
        }
        //returns the new state of the child
        return children;
    }

    //private method to check if the next position is possible or not
    private boolean isValidMove(int newPos)
    {
        return newPos >= 0 && newPos < 9 &&
                ((positionOfNine % 3 == 0 && newPos % 3 == 2) 
                || (positionOfNine % 3 == 2 && newPos % 3 == 0)) == false;
    }

    //method to swap the adjacent integer positions
    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //void method to print initial state
    public void printState()
    {
        for (int i = 0; i < 9; i++) 
        {
            //printing out the initial state of the board and the content
            System.out.print(board[i] + " ");
            if((i+1)%3==0)
            {
                System.out.println();
            }
        }
    }

    //printing out compareTo method for sorting in the priority queue
    @Override
    public int compareTo(State other) 
    {
        return Integer.compare(this.heuristicValue, other.heuristicValue);
    }
}