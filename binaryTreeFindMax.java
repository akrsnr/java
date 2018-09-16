// Soner - Exercise

public static int findMax(Node binaryTreeNode) {
    if (binaryTreeNode.right == null && binaryTreeNode.left == null) {
        return binaryTreeNode.data;
    }
    if (binaryTreeNode.left == null) {
        if (binaryTreeNode.right.data > binaryTreeNode.data)
            return binaryTreeNode.right.data;
        else
            return binaryTreeNode.data;
    }
    if (binaryTreeNode.right == null) {
        if (binaryTreeNode.left.data > binaryTreeNode.data)
            return binaryTreeNode.left.data;
        else
            return binaryTreeNode.data;
    }
    
    // if both branches are not null

    int leftData = findMax(binaryTreeNode.left);
    int righData = findMax(binaryTreeNode.right);

    int maxOfTwoBranches = leftData > righData ? leftData : righData;

    return binaryTreeNode.data > maxOfTwoBranches ? binaryTreeNode.data : maxOfTwoBranches;
}
