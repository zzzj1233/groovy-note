static void main(String[] args) {
    // 1. 定义map的第一种方式
    def mapping = new HashMap<String, Object>(16)

    mapping['name'] = "zzzj"
    mapping['age'] = "22"

    def nameConst = 'name'

    assert mapping.name == "zzzj"
    assert mapping["name"] == "zzzj"
    assert mapping[nameConst] == "zzzj"

    assert mapping.unknown == null
    assert mapping["unknown"] == null

    // 2. 定义map的第二种方式
    def map = ['scriptName': 'QuickSortHandler.groovy', 'content': '//QuickSort']

    assert map instanceof LinkedHashMap<String, Object>

    // 3. 使用变量作为key的陷阱
    def star = [nameConst: "zxd", "age": 29]

    // nameConst被当成了字符串
    assert star[nameConst] == null
    assert star.nameConst == "zxd"

    star = [(nameConst): "zxd", "age": "29"]

    assert star[nameConst] == "zxd"
    assert star.nameConst == null
}