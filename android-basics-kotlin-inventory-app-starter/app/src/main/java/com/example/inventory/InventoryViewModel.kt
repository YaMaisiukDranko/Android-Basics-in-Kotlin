package com.example.inventory

import androidx.lifecycle.ViewModel
import com.example.inventory.data.ItemDao

class InventoryViewModel(private val itemDao: ItemDao) : ViewModel() {}