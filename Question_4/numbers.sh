#!/bin/sh

read -p "Enter X: " x;
read -p "Enter Y: " y;

if [ $x -lt $y ];
    then echo "X is less than Y";
else echo "Y is less than X";
fi;