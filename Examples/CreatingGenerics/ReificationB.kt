// CreatingGenerics/ReificationB.kt
// (c)2021 Mindview LLC. See Copyright.txt for permissions.
package creatinggenerics

// Doesn't compile because of erasure:
// fun <T: Any> b() = a(T::class)
