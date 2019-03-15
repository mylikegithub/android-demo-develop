#!/bin/bash
# author:zhangteng709

current_git_branch_latest_log=`git log -n 1`

lasteCommitlog=${current_git_branch_latest_log##*Date:}

curl -F "file=@"$1"" -F "buildName="$4"" -F "_api_key="$3"" -F "buildUpdateDescription="$lasteCommitlog"" http://www.pgyer.com/apiv2/app/upload

