#!bin/bash
deletedBranchName=$1
git checkout master &&
git branch -d $1 &&
git pull origin master
