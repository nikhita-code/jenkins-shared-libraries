// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh " DOCKER_BUILDKIT=1 docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
