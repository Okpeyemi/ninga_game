#!/bin/bash

if [ -z "$1" ]; 
then
  echo 'Veuillez fournir un message de commit. (./nom_du_fichier_a_execute.sh "Votre message de commit"'
  exit 1
fi

git add .

git commit -m "$1"

git push origin
