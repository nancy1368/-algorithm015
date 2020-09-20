1. DFS

深度优先遍历算法，用遍历实现，也可以手动维护一个栈来实现

DFS模板
 public List<List<Integer>> levelOrder( TreeNode root){
        List<List<Integer>> allResults = new ArrayList<>();
        
        if(root == null){
            return allResults;
        }
        
        travel(root, 0, allResults);
        
        return allResults;
        
    }
    
    private void travel(TreeNode root, int level, List<List<Integer>> results){
        if(results.size() == level){
            results.add((new ArrayList<>()));
        }
        
        results.get(level).add(root.val);
        
        if(root.left != null){
            travel(root.left, level+1, results);
        }
        
        if(root.right != null){
            travel(root.right, level+1, results);
        }
            
    }

2. BFS

广度优先遍历算法，用queue实现

BFS模板
public List<List<Integer>> levelOrder ( TreeNode root){
        List<List<Integer>> allResults = new ArrayList<>();

        if ( root == null ) return allResults;

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            int size = nodes.size();
            List<Integer> results = new ArrayList<>();
            for (int i = 0 ; i < size ; i++){
                TreeNode node = nodes.poll();
                results.add(node.val);
                if (node.left != null){
                    nodes.add(node.left);
                }
                if(node.right!=null){
                    nodes.add(node.right);
                }
            }
            allResults.add(results);
        }
        return allResults;


    }

3. 贪心算法
贪心算法：考虑局部最优，不可回退。但是局部最优不一定是整体最优，一般作为辅助算法。

与动态规划的区别在于，动态规划可以回退而贪心算法不能。

4. 二分查找

二分查找的特点：
单调递增（有时候也可以局部单调递增）；

有上下界；

能用下标查找

二分查找的模板
public int binarySearch(int[] array, int target){
        int left = 0, right = array.length - 1 , mid;
        while(left <= right){
            mid = left + (right - left)/2;
            if (array[mid] == target){
                return mid;
            }
            else if (array[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
	
寻找半序数组的变序的位置，假定半序数组是单调递增的
public class FindDisOrder {
    
    public int findDisOrder(int[] array){
        int left = 0, right = array.length - 1 ;           
        
        int index = find(array,left, right);
        return index;
    }

    private int find( int[] array,int left, int right ) {
        //terminator
        if ( left == right || right == 1) return -1;
        //process current logic
        int mid = left + (right - left)/2;
        if( array[mid-1] > array[mid] ||  array[mid] >  array[mid+1]){
            return mid;
        }
		//drill down
        int leftIndex = find(array, left, mid-1);
        int rightIndex = find(array, mid+1, right);
        if(leftIndex != -1) return leftIndex;
        if(rightIndex != - 1) return rightIndex;
        return -1;        
        }       
        
        
    }