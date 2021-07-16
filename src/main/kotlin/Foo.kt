@CompiledJson2
data class Foo(val id: Int)

@com.dslplatform.json.CompiledJson // error
data class Bar(val id: Int)
