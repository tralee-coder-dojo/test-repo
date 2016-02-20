# Common Command for use with git


git clone [copy of repo URL from git site]

This will download ('clone') a complete copy of the latest versions of 'master' in the specified git repo
a folder will be created where ever you issue this command for example, if you do this in C:\ and the name of the repo is 
test-repo.git, then a folder will be created called C:\test-repo

You must cd into this folder to issue any of the following commands

*git status* lets you know the status of your local folder (and sub folders)
	

*git pull* will pull any changes from a remote git repo (github) since you last cloned/pulled from there

*git push* will 'push' any local changes that you have commited to the remote repo (github)

*git add .* this will add all files and folders that you have changed to the STAGE (an area to hold files/folder that you
intend to commit later)


*git commit -m "[YOUR MESSAGE]"* will commit all your local STAGED changes locally (these will then need to be pushed to github if you want to shared them)


If in git commit an editor opens to add your message, to save type [ESC] then :wq

