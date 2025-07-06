/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;
import Object.State;
import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * Ntshangase
 * Ntokozo 
 * 4123601
 * CSC311 2023 AI Practical 
 */
public class MoveMagicSquare 
{
    public static void main(String[] args) 
    {   
        //creating scanner to read in what text file the user wants to use
        Scanner scLine = new Scanner(System.in);
        System.out.println("Enter which text file you want to use for creating the initial board state\n(A = for InputA.txt, B = for InputB.txt: ) ");
        String userFile = scLine.nextLine();
        scLine.close();
        
        String filePath = "";
        
        //checking which text file the user wants to use
        if(userFile.equalsIgnoreCase("A"))
        {
            filePath = "InputA.txt";
        }
        else if(userFile.equalsIgnoreCase("B"))
        {
            filePath = "InputB.txt";
        }

        //creating initial state of the board using imported text file
        int[] initialBoard = readBoardFromFile(filePath);
        int initialHeuristic = calculateHeuristic(initialBoard);
        int initialPositionOfNine = findPositionOfNine(initialBoard);
        State initialState = new State(initialBoard, initialHeuristic, initialPositionOfNine);

        //create priority queue to store list of expanded states
        PriorityQueue<State> frontier = new PriorityQueue<>();
        frontier.add(initialState);

        //printing the initial state of the board
        System.out.println("Initial State:");
        initialState.printState();
        System.out.println();

        //perform moves and generate children states
        State currentState = initialState;
        while(!frontier.isEmpty())
        {
            currentState = frontier.poll();
            System.out.println("Current State = (hValue: " + currentState.getHeuristicValue() + ")");
            currentState.printState();
            System.out.println();

            //array to generate children states and display the expanded state
            State[] children = currentState.generateChildren();
            for(State child : children)
            {
                if(child != null)
                {
                    frontier.add(child);
                }
            }
        }
    }

    //private method to reading in values from the board
    private static int[] readBoardFromFile(String filePath)
    {
        //creating board with 9 spaces
        int[] board = new int[9];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            int index = 0;
            //checking if line contains values before proceeding
            while((line=reader.readLine()) != null)
            {
                String[] values = line.split(" ");
                for(String value : values)
                {
                    board[index] = Integer.parseInt(value);
                    index++;
                }
            }
        }
        //catch exception for dangerous code above or errors
        catch(IOException e) 
        {
            e.printStackTrace();
        }
        //return the values imported from the text file into the created board
        return board;
    }

    //method used to calculate the heuristic value of position 9 at a specific position on the board
    private static int calculateHeuristic(int[] board)
    {
        int heuristic = 0;
        for (int i = 0; i<board.length; i++)
        {
            //checking position on board, cant = 9 or current position + 1
            if (board[i] != i+1 && board[i] != 9)
            {
                //update and add 1 to the heuristic value
                heuristic++;
            }
        }
        //returning upddated heuristic value
        return heuristic;
    }

    //method to find the position of "9" in a already created board
    private static int findPositionOfNine(int[] board)
    {
        for (int i = 0; i<board.length; i++)
        {
            //if position on board = 9 then position i is returned
            if (board[i]==9)
            {
                return i;
            }
        }
        //return -1 if 9 is not found on the board
        return -1;
    }
}
