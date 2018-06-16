package Oath.Phone.Interview.Solution;

import java.util.LinkedList;

/**
 * Created by khush on 6/8/2018.
 */
class Graph {

        private boolean adjMatrix[][];
        private int vertexCount = 0;
        public boolean[] visited;

        public Graph(int vertexCount){
            this.vertexCount = vertexCount;
            adjMatrix = new boolean[vertexCount][vertexCount];
            for(int i=0;i<vertexCount;i++)
                adjMatrix[i][i]=true;

            visited = new boolean[vertexCount];
        }

        public void connect(int i, int j){
            if(!isConnected(i,j)) {
                if (i >= 0 && i < vertexCount && j >= 0 && j < vertexCount) {
                    adjMatrix[i][j] = true;
                    adjMatrix[j][i] = true;
                }
            }
        }

        public boolean isConnected(int i, int j){

            if(i==j)
                return true;

            if(i>=0 && i<vertexCount && j>=0 && j<vertexCount && isPath(i,j,vertexCount))
                return adjMatrix[i][j];

            return false;
        }

        public boolean isPath(int s, int d, int vertexCount){
            LinkedList<Integer> queue = new LinkedList<Integer>();

            visited[s]= true;
            queue.add(s);
            int v1;

            while(!queue.isEmpty()){
                int v2 = queue.remove();

                while((v1=getAdjUnvisitedVertex(v2,visited)) != -1){
                    visited[v1]=true;
                    queue.add(v1);
                    if(visited[d])
                        return true;
                }

            }
            return false;
        }

        public int getAdjUnvisitedVertex(int v2, boolean[] visited){

            for(int k=0; k<vertexCount; k++){
                if(adjMatrix[v2][k]== true && visited[k]==false)
                    return k;
            }
            return -1;
        }
    }

