
/*
 * Level - Medium
 
 * Find the minimal nucleotide from a range of sequence DNA.
 
 * Solution - https://app.codility.com/demo/results/training6F9KTZ-9U6/
 */
vector<int> solution(string &S, vector<int> &P, vector<int> &Q) {
    int genomes [3][S.length() + 1];
    short a, c, g;
    for(int i = 0; i < S.length(); i++) {
        a = c = g = 0;
        if('A' == S.at(i)) {
            a = 1;
        }
        if('C' == S.at(i)) {
            c = 1;
        }
        if('G' == S.at(i)) {
            g = 1;
        }
        genomes [0][i+1] = genomes[0][i] + a;
        genomes [1][i+1] = genomes[1][i] + c;
        genomes [2][i+1] = genomes[2][i] + g;

    }

    vector<int> result;

    for(int i = 0; i < P.size(); i++) {
        int fromIndex = P[i];
        int toIndex = Q[i] + 1;
        if(genomes[0][toIndex] - genomes[0][fromIndex] > 0) {
            result.push_back(1);
        } else if(genomes[1][toIndex] - genomes[1][fromIndex] > 0) {
            result.push_back(2);
        } else if(genomes[2][toIndex] - genomes[2][fromIndex] > 0) {
            result.push_back(3);
        } else {
            result.push_back(4);
        }
    }

    return result;
}
