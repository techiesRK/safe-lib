package com.dhanuka.safeobuddy.customDetail.model

class DashboardModel(title: String?, price: String?, date: String?) {
        private var title: String
        private var price: String
        private var date: String
        init {
            this.title = title!!
            this.price = price!!
            this.date = date!!
        }
        fun getTitle(): String? {
            return title
        }
        fun setTitle(name: String?) {
            title = name!!
        }
        fun getDate(): String? {
            return date
        }
        fun setDate(date: String?) {
            this.date = date!!
        }
        fun getPrice(): String? {
            return price
        }
        fun setPrice(price: String?) {
            this.price = price!!
        }
    }