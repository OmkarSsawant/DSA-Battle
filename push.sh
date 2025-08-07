#! /bash/bin
COMMIT_MSG="$1"
echo $COMMIT_MSG
cd /home/turalzen/Programming/striver-A-Z
git add .
git commit -m "$COMMIT_MSG"
git push -u origin master

echo "Pushed Code Successfully"
