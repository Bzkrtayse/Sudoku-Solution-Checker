

    public static boolean checkIfSolutionIsTrue(int[][] sudokuBoard) {
        // check rows and columns
        for (int i = 0; i < 9; i++) {
            int[] rowcells = new int[10];
            int[] colcells = new int[10];

            for (int j = 0; j < 9; j++) {
                int rowCell = sudokuBoard[i][j];
                int colCell = sudokuBoard[j][i];

                //check if there is unvaild numbers
                if (rowCell < 1 || rowCell > 9) {
                    return false;
                }

                if (rowcells[rowCell] > 0) {
                    return false;
                }
                rowcells[rowCell]++;

                if (colcells[colCell] > 0) {
                    return false;
                }
                colcells[colCell]++;
            }
        }

        // Check 3x3 subgrids
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                int[] boxcells = new int[10];

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int cell = sudokuBoard[r * 3 + i][c * 3 + j];

                        if (boxcells[cell] > 0) {
                            return false;
                        }
                        boxcells[cell]++;
                    }
                }
            }
        }

        return true;
    }

