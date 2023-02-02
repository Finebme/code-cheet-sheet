#!/bin/sh
INPUT_STRING=hello
while [ $INPUT_STRING != "bye" ]
do
	echo "pls type something,'bye' to quit"
	read INPUT_STRING
	echo "you typed: $INPUT_STRING"
done
echo "ok~byebye"
