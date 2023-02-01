#!/bin/sh
echo 'your name?'
read name
echo "hi,$name"
echo "create file ${name}_file"
touch "${name}_file"

