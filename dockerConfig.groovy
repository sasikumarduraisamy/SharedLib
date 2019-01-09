#!groovy

/* checkout the docker file and configuration files.
 * Copy build artifact to Docker folder.
 */
def call(Map buildconfig) {
	cleanWs() //clean workspace before build trigger
	sh "mkdir $dockerPath"
  print $dockerPath
	sharedLibRepoName = buildconfig.repoName == null ? 'Testing' : buildconfig.sharedLibRepo	
  print "sharedLibRepoName is" $sharedLibRepoName
	//folderExists = fileExists "$dockerPath/Scripts"
	//baseFolder = folderExists == true ? 'Scripts' : 'scripts'
	//sh "cp $dockerPath/$baseFolder/*.sh ./$dockerPath/${buildconfig.componentName}/Docker"
	//artifactName = "${env.TARGETPATH}".minus("$stagingPath").minus("_$JOB_BASE_NAME").minus("_$BUILD_NUMBER")
	///sh "mv ${env.TARGETPATH} ./$dockerPath/${buildconfig.componentName}/Docker/$artifactName"
}
